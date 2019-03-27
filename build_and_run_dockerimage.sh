#!/usr/bin/env bash
docker stop first_docker_container
docker rm first_docker_container
docker build . -t first_docker_image
docker run -it \
           --name first_docker_container \
           first_docker_image bash
