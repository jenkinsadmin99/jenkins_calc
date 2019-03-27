#!/usr/bin/env bash
docker build . -t first_docker_image
docker run -it \
           --name first_docker_container \
           first_docker_image bash 
 