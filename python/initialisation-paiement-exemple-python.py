import requests
import time;

API_KEY = "12912847765bc0db748fdd44.40081707"
SITE_ID = "445160"
URL = "https://new-api.cinetpay.ci/v2/payment"

headers = {
    "Content-Type": "application/json"
}

data = {
    "amount": "100",
    "apikey": API_KEY,
    "site_id": SITE_ID,
    "currency": "XOF",
    "transaction_id": str(time.time()),
    "description": "TRANSACTION DESCRIPTION",
    "return_url": "https://www.exemple.com/return",
    "notify_url": "https://www.exemple.com/notify",
    "customer_name": "Dje Bi",
    "customer_surname": "Jean-Marc"
    
}

response = requests.post(url=URL, headers=headers, json=data)

print(response)