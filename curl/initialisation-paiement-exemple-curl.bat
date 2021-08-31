curl -X POST https://new-api.cinetpay.ci/v2/payment \
-H "Content-Type: application/json" \
-d '{
        "amount": "100",
        "apikey": "12912847765bc0db748fdd44.40081707",
        "site_id": "445160",
        "currency": "XOF",
        "transaction_id": "1629808519.472657",
        "description": "TRANSACTION DESCRIPTION",
        "return_url": "https://www.exemple.com/return",
        "notify_url": "https://www.exemple.com/notify",
        "customer_name": "Dje Bi",
        "customer_surname": "Jean-Marc"
    }'