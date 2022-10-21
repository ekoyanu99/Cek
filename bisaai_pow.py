import json
from datetime import datetime
from hashlib import sha256

class Blockchain(object):
    def __init__(self):
        self.chain = []
        self.chain.append(self.new_block())

    def new_block(self):
        block = {
            'timestamp' : datetime.utcnow().isoformat(),
            'prev_hash' : self.chain[-1]["hash"] if len(self.chain)>0 else None,
            'nonce' : len(self.chain)
        }
        block["hash"] = sha256(json.dumps(block).encode()).hexdigest()
        return block

    def proof_of_work(self):
        while True:
            new_block = self.new_block()
            if new_block["hash"].startswith("0000"):
                break
        self.chain.append(new_block)

bc = Blockchain()
bc.proof_of_work()
print("Sukses menambahkan blok baru")