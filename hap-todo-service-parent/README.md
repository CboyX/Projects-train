#### 		HapCloudDemo(一个待办事项服务)

该Demo包含的功能（API）如下：

1. ```
   创建task
   ```

2. ```
   根据任务编号获取任务
   ```

3. ```
   根据任务ID更新任务信息
   ```

4. ```
   根据版本编号获取任务
   ```

5. ```
   根据ID删除任务
   ```

6. ```
   根据任务号码删除任务
   ```

##### API测试：需要在启动hapcloud中的一些核心服务才能测试该待办事项的API

##### 需要启动的服务：

```java
hap-register-server
hap-oauth-server
hap-api-gateway
hap-user-service
hap-user-admin-service
hap-framework-service
```

