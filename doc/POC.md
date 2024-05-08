## Installing and Configuring ArgoCD

### Prerequisites
- A Kubernetes cluster already set up (e.g., minikube, kind, or k3d)
- `kubectl` is installed and configured to access the cluster

### Install ArgoCD

1. **Create the ArgoCD Namespace:**
    ```bash
    kubectl create namespace argocd
    ```

2. **Install ArgoCD:**
    ```bash
    kubectl apply -n argocd -f https://raw.githubusercontent.com/argoproj/argo-cd/stable/manifests/install.yaml
    ```

### Access the ArgoCD UI

1. **Port Forward to Local Machine:**
    ```bash
    kubectl port-forward svc/argocd-server -n argocd 8080:443
    ```

2. **Access the UI:**
    Go to `https://localhost:8080`.

### Log In to ArgoCD

1. **Retrieve the Initial Admin Password:**
    ```bash
    kubectl get secret argocd-initial-admin-secret -n argocd -o jsonpath="{.data.password}" | base64 -d
    ```

2. **Log In with:**
    - **Username**: `admin`
    - **Password**: [Decoded password]

### Optional: Install ArgoCD CLI

1. **Download and Install:**
    ```bash
    curl -sSL -o /usr/local/bin/argocd https://github.com/argoproj/argo-cd/releases/download/v2.4.7/argocd-linux-amd64
    chmod +x /usr/local/bin/argocd
    ```

2. **Login via CLI:**
    ```bash
    argocd login localhost:8080
    ```
