BUILD
docker build . -t gastos-monedas

RUN
docker run -dti --network=gastos -p 8080:8080 gastos-monedas