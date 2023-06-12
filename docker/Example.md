```sh
docker run -ti -m 512M openjdk:8u181-jdk
```

```sh
docker run -ti -m 512M openjdk:8u212-jdk
```

```sh
java -XX:+PrintFlagsFinal -version | grep MaxHeap
# 8u181
# 8u212
```