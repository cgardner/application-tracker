FROM mcr.microsoft.com/devcontainers/java:0-17

ARG INSTALL_MAVEN="true"
ARG MAVEN_VERSION=""

ARG INSTALL_GRADLE="false"
ARG GRADLE_VERSION=""

ENV WORKSPACE_ROOT="/workspaces/jobmanager"

RUN if [ "${INSTALL_MAVEN}" = "true" ]; then su vscode -c "umask 0002 && . /usr/local/sdkman/bin/sdkman-init.sh && sdk install maven \"${MAVEN_VERSION}\""; fi \
    && if [ "${INSTALL_GRADLE}" = "true" ]; then su vscode -c "umask 0002 && . /usr/local/sdkman/bin/sdkman-init.sh && sdk install gradle \"${GRADLE_VERSION}\""; fi

# [Optional] Uncomment this section to install additional OS packages.
RUN apt-get update && export DEBIAN_FRONTEND=noninteractive \
    && apt-get -y install --no-install-recommends entr 
    
RUN wget "https://github.com/liquibase/liquibase/releases/download/v4.21.1/liquibase-4.21.1.tar.gz" -O /tmp/liquibase.tar.gz \
    && mkdir -p /opt/liquibase \
    && tar -C /opt/liquibase -xzf /tmp/liquibase.tar.gz \
    && chmod +x /opt/liquibase/liquibase \
    && ln -s /opt/liquibase/liquibase /usr/local/bin/ \
    && rm /tmp/liquibase.tar.gz

RUN echo 'export LIQUIBASE_DEFAULTS_FILE="${WORKSPACE_ROOT}/src/main/resources/application.yml"' >> /etc/bash.bashrc \
    && echo 'alias g="git"' >> /etc/bash.bashrc 


# [Optional] Uncomment this line to install global node packages.
# RUN su vscode -c "source /usr/local/share/nvm/nvm.sh && npm install -g <your-package-here>" 2>&1
