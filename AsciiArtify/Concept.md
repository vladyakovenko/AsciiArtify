# AsciiArtify: comparative analysis of minikube, kind, and k3d

## Introduction

- minikube: A local Kubernetes system that deploys a Kubernetes cluster on a single computer, ideal for development and testing.
- kind: Creates Kubernetes clusters in Docker containers, making it flexible and portable for local testing.
- k3d: Uses Rancher Kubernetes Engine (RKE) to create lightweight Kubernetes clusters in Docker containers.

## Key Characteristics, Advantages and Disadvantages

| Feature                | minikube                 | kind                       | k3d                       |
|------------------------|--------------------------|----------------------------|--------------------------|
| OS Support             | Linux, macOS, Windows    | Linux, macOS, Windows      | Linux, macOS, Windows    |
| Architecture Support   | x86_64, ARM64            | x86_64, ARM64              | x86_64, ARM64            |
| Automation Capabilities| Medium                   | High                       | High                     |
| Additional Features    | Monitoring tools         | Load balancing             | Lightweight clusters     |
| Community Support      | Large                    | Growing                    | Growing                  |

## Demonstration

### Minikube
```sh
minikube start
kubectl create deployment hello-minikube --image=k8s.gcr.io/echoserver:1.4
kubectl expose deployment hello-minikube --type=NodePort --port=8080
minikube service hello-minikube --url
```

### k3d
```sh
k3d cluster create
kubectl create deployment hello-k3d --image=k8s.gcr.io/echoserver:1.4
kubectl expose deployment hello-k3d --type=LoadBalancer --port=8080
kubectl get services hello-k3d
```

### Kind
```sh
kind create cluster
kubectl create deployment hello-kind --image=k8s.gcr.io/echoserver:1.4
kubectl expose deployment hello-kind --type=NodePort --port=8080
kubectl get services hello-kind
```


