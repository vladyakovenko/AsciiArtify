FROM quay.io/projectquay/golang:1.20

WORKDIR /app
COPY . /app

CMD ["./bin/myapp"]
