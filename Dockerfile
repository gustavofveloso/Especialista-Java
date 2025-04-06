FROM ubuntu:24.10

RUN apt-get update && apt-get install -y vim curl zip

RUN curl -s "https://get.sdkman.io" | bash && \
    bash -c "source /root/.sdkman/bin/sdkman-init.sh && sdk install java 17.0.14-tem"

RUN echo "source /root/.sdkman/bin/sdkman-init.sh" >> /root/.bashrc

ENV JAVA_HOME="/root/.sdkman/candidates/java/current"
ENV PATH="$JAVA_HOME/bin:$PATH"

WORKDIR /usr/src/especialista-java
