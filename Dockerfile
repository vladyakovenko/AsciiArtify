FROM quay.io/projectquay/golang:1.20

WORKDIR /app
COPY . /app

RUN go test ./...

CMD ["./bin/myapp"]
