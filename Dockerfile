FROM amazoncorretto:17.0.0-alpine

LABEL author = "Ashok Gudise" \
            github = "https://github.com/ashokgudise" \
                medium = "https://medium.com/@gudise.ashok" \
                    linkedIn = "https://www.linkedin.com/in/ashokgudise/"

WORKDIR /app/

COPY target/orchestration-demo-api.jar /app/

ENTRYPOINT ["sh", "-c", "java -jar /app/orchestration-demo-api.jar"]

EXPOSE 8080

#docker buildx build -t ashokgudise/orchestration-demo-api:1.0 .
#docker run -it -rm --env --name orchestration-demo-api ashokgudise/orchestration-demo-api