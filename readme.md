[Blog Link]()

````

# helm install nginx-ingress ingress-nginx/ingress-nginx

#Create Helm Charts for your Spring Boot App
helm install --debug orchestration-demo-api ./deployment/orchestration-demo-api/

http://localhost:8080/actuator/health

nslookup orchestration-demo.local

#Command to Check Pod Logs

kubectl logs -n <namespace> <ingress-controller-pod-name>


 Helm Chart: customized-app-0.1.0
 
 
#Create Operator Helm Chart 
operator-sdk init --plugins=helm.sdk.operatorframework.io/v1 \
      --domain=ashokgudise.docker.io \
      --helm-chart=/Users/ashokgudise/IdeaProjects/Quarkus/orchestration-demo-api/deployment/orchestration-demo-api

#Build Docker Image for Operator 
docker buildx build -t ashokdemos/customized-object-operator:v1.0.0 . 

#Use Make Calls to build and install the operator in K8s Cluster
make install run

make docker-build docker-push IMG=docker.io/ashokgudise/orchestration-demo-operator:1.0

make bundle bundle-build bundle-push docker.io/ashokgudise/orchestration-demo-operator:1.0

make deploy

kubectl get all -n namespace/orchestration-demo-operator-system

````


### References

[SpringBoot-Helm Charts](https://josephrodriguezg.wordpress.com/2022/01/05/deploying-a-spring-boot-application-in-kubernetes-using-helm-charts/)

[Github Actions](https://github.com/helm/chart-releaser-action)

[Helm Operators](https://cloud.redhat.com/blog/make-a-kubernetes-operator-in-15-minutes-with-helm)

[Helm Operator](https://sdk.operatorframework.io/docs/building-operators/helm/tutorial/)

[NGINX-Controller](https://docs.rancherdesktop.io/how-to-guides/setup-NGINX-Ingress-Controller/)

[Ingress Troubleshoot](https://medium.com/@ManagedKube/kubernetes-troubleshooting-ingress-and-services-traffic-flows-547ea867b120)

[Helm OSDK Tutorial](https://docs.openshift.com/container-platform/4.8/operators/operator_sdk/helm/osdk-helm-tutorial.html)

[Helm Tutorial](https://sdk.operatorframework.io/docs/building-operators/helm/tutorial/)

````
#To run in Local

    kubectl create ingress orchestration-demo.local-localhost --class=nginx \
        --rule="orchestration-demo.local/*=orchestration-demo-apil:8080"

    kubectl get validatingwebhookconfigurations -n ingress-nginx

     
    curl --resolve orchestrationdemoapi-sample-orchestration-demo-api:8080:127.0.0.1  http://localhost:57699/swagger-ui/index.html

````



 


