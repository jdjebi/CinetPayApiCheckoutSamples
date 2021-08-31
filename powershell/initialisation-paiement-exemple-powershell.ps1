$url = "https://new-api.cinetpay.ci/v2/payment"

$body = @{
        amount = 100
        apikey = "129128sdsd47765bc0db748fdd44.40081707"
        site_id = "445160"
        currency = "XOF"
        transaction_id = "1629808519.4726gcxbcvbxvcbx57"
        description = "TRANSACTION DESCRIPTION"
        return_url = "https://www.exemple.com/return"
        notify_url = "https://www.exemple.com/notify"
        customer_name = "Dje Bi"
        customer_surname = "Jean-Marc"
}

Invoke-RestMethod -Method POST -ContentType "application/json" -Body $body -uri $url