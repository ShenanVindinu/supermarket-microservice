from flask import Flask, jsonify

app = Flask(__name__)

CONTEXT_PATH = "/customer"
SERVICE_PORT = 5000


app.run(port=SERVICE_PORT)

@app.route(f'{CONTEXT_PATH}/customer', methods=["GET"])
def get_customer():
    customer_list=[
        {"id":1, "name":"John Doe", "email":"jhon@gmail.com"},
        {"id":2, "name":"Jane Doe", "email":"jane@gmail.com"}
    ]
    return jsonify(customer_list)

app.run(port=SERVICE_PORT)

