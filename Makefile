.PHONY: all linux arm macos windows image clean

IMAGE_TAG := myapp

all: linux arm macos windows

linux:
	GOOS=linux GOARCH=amd64 go build -o ./bin/myapp-linux main.go

arm:
	GOOS=linux GOARCH=arm64 go build -o ./bin/myapp-arm main.go

macos:
	GOOS=darwin GOARCH=amd64 go build -o ./bin/myapp-macos main.go

windows:
	GOOS=windows GOARCH=amd64 go build -o ./bin/myapp.exe main.go

image:
	docker build -t $(IMAGE_TAG) .

clean:
	rm -rf ./bin/*
	docker rmi $(IMAGE_TAG)
