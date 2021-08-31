const axios = require("axios");

const API_KEY = "12912847765bc0db748fdd44.40081707";

const SITE_ID = "445160";

const URL = "https://new-api.cinetpay.ci/v2/payment";

const CONFIG = {
    headers: {'Content-Type': 'application/json'}
}

let data = {
    "amount": "100",
    "apikey": API_KEY,
    "site_id": SITE_ID,
    "currency": "XOF",
    "transaction_id": "123",
    "description": "TRANSACTION DESCRIPTION",
    "return_url": "https://www.exemple.com/return",
    "notify_url": "https://www.exemple.com/notify",
    "customer_name": "Dje Bi",
    "customer_surname": "Jean-Marc"
    
}

axios.post(URL,data,CONFIG)
    .then(function(api_response){

        let response = api_response.data;

        console.log(response);

    })
    .catch(function(error){

        console.log(error.message);

    });