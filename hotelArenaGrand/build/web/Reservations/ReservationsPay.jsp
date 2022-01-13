<%-- 
    Document   : ReservationsPay
    Created on : Dec 28, 2021, 6:07:49 PM
    Author     : Mahima
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Reservations</title>
        <link href="http://fonts.cdnfonts.com/css/poppins" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="./ReservationsPay.css" />
    </head>
    <body>

        <div class="reserve-header-image">
            <h1 class="header-text">Reservations</h1>
        </div>

        <div class="container Pay-form-container">
            <div class="reserve2">
                <form class="form" action="Paypal.jsp">
                    <br/><br/>
                    <div class="input_field">
                        <label>Name on Card</label>
                        <input type="text" class="pay_input">
                    </div>
                    <div class="input_field">
                        <label>Card Number</label>
                        <input type="text" class="pay_input">
                    </div>

                    <div class="input_field">
                        <label>Expire Month/Year</label>
                        <input type="month" class="pay_input">
                    </div>
                    <div class="input_field">
                        <label>Total Price</label>
                        <input type="text" class="pay_input">
                    </div> <br />
                    <div class="row">
                        <div class="col-4">
                            <div class="payment_field">
                                <label>visa</label>
                                <input type="radio" id="visa" class="payment_input">
                            </div>
                        </div>
                        <div class="col-4">
                            <div class="payment_field">
                                <label>American Express</label>
                                <input type="radio" id="Amex" class="payment_input">
                            </div>
                        </div>
                        <div class="col-4">
                            <div class="payment_field">
                                <label>Paypal</label>
                                <input type="radio" id="Paypal" class="payment_input">
                            </div>
                        </div>
                    </div>
                    <div class="input_field">
                        <input type="submit" value="Pay Now" class="btn" onclick="window.location.href = './ReservationsAvailable.jsp';">
                    </div>
                    <!--Paypal Integration-->
                    <div id="smart-button-container">
                        <div style="text-align: center;">
                            <div id="paypal-button-container"></div>
                        </div>
                    </div>
                    <script src="https://www.paypal.com/sdk/js?client-id=AdNH0V50CjsGNdacW_MycidixGny38li19VxpYZR3TJA2d4DtbWIDGcuJlCxhl9G0vChoGxEH2U__P9L&disable-funding=venmo&currency=USD" data-sdk-integration-source="button-factory"></script>
                    <script>
                            function initPayPalButton() {
                                paypal.Buttons({
                                    style: {
                                        shape: 'rect',
                                        color: 'gold',
                                        layout: 'vertical',
                                        label: 'paypal',

                                    },

                                    createOrder: function (data, actions) {
                                        return actions.order.create({
                                            purchase_units: [{"amount": {"currency_code": "USD", "value": 1}}]
                                        });
                                    },

                                    onApprove: function (data, actions) {
                                        return actions.order.capture().then(function (orderData) {

                                            // Full available details
                                            console.log('Capture result', orderData, JSON.stringify(orderData, null, 2));

                                            // Show a success message within this page, e.g.
                                            const element = document.getElementById('paypal-button-container');
                                            element.innerHTML = '';
                                            element.innerHTML = '<h3>Thank you for your payment!</h3>';

                                            // Or go to another URL:  actions.redirect('thank_you.html');

                                        });
                                    },

                                    onError: function (err) {
                                        console.log(err);
                                    }
                                }).render('#paypal-button-container');
                            }
                            initPayPalButton();
                    </script>
                </form>
            </div>
        </div>        
    </body>
</html>
