# price-service

This microservice calculates the price for products using the prices of the components the product consists of.

The service expects an object consisting of a list of float values containing the component prices (see
model/ComponentPrices), adds them up and returns an object consisting of a single float representing the product price.