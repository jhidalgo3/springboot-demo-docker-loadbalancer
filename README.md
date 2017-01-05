# Docker Demo Springboot Application

This is a Soringboot demo application used for demonstrating Docker and load balancing.

Migrate to Springboot from Go project [ehazlett/docker-demo](https://github.com/ehazlett/docker-demo)

## Build

`mvn clean package`
`docker build -t springboot-demo-docker-loadbalancer .`

## Run

`docker run -p 8080:8080 --rm pringboot-demo-docker-loadbalancer`
