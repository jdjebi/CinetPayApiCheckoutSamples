<?php

require "vendor/autoload.php";

// Initialisation

$API_KEY = "12912847765bc0db748fdd44.40081707"; 
        
$SITE_ID = "445160";

$URL = "https://api-checkout.cinetpay.com/v2/payment";

$amount = 100; // $_POST["amount"];

// Creation du client php

$httpClient = new GuzzleHttp\Client([
    "base_uri" => $URL
]);

// Construction du paiement 

$payment = [
    "amount" => $amount,
    "apikey"=> $API_KEY,
    "site_id"=> $SITE_ID,
    "currency"=> "XOF",
    "transaction_id" => "1629812407.9862325",
    "description" => "TRANSACTION DESCRIPTION",
    "return_url" => "https://www.exemple.com/return",
    "notify_url" => "https://www.exemple.com/notify",
    "customer_name" => "nom-du-client",
    "customer_surname" => "prenom-du-client"
];

// Definition de la route :: cette approche est specifique a GuzzleHttp\Client  

$uri = "";

// Configuration de la requete :: cette approche est specifique a GuzzleHttp\Client  

$option = [
    'json' => $payment // cette configuration permet de dire a guzzle d'utiliser l'entete Content-Type: application/json
];

// Envoie de la requete avec la methode post

$response_cinetpay = $httpClient->post($uri,$option);

// Extraction de la requete

$body_string = (string) $response_cinetpay->getBody();

$data = json_decode($body_string,true); // Retourne le tableau contenant les donnees de la reponse

$payment_url = $data["data"]["payment_url"];

echo $payment_url."\n";

// Enregistrement du payment token dans votre base de donnees

/* Redirection vers le guichet

header("Location:".$payment_url);

*/


?>