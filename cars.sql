SELECT cars1.*
	FROM cars cars1
	INNER JOIN (
	SELECT manufacturer, MAX(price) AS HIGHEST_PRICE 
	FROM cars
	GROUP BY manufacturer) cars_sq 
	ON cars1.manufacturer = cars_sq.manufacturer AND cars1.price = cars_sq.HIGHEST_PRICE;
