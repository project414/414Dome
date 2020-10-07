package snippet;

public class Snippet {
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
		xmlns:aop="http://www.springframework.org/schema/aop"
		xmlns:tx="http://www.springframework.org/schema/tx"
		xsi:schemaLocation="
	     http://www.springframework.org/schema/beans 
	     http://www.springframework.org/schema/beans/spring-beans.xsd
	     http://www.springframework.org/schema/tx
	     http://www.springframework.org/schema/tx/spring-tx.xsd
	     http://www.springframework.org/schema/aop 
	     http://www.springframework.org/schema/aop/spring-aop.xsd
	     http://www.springframework.org/schema/context
	     http://www.springframework.org/schema/context/spring-context.xsd">
		
		
		<!-- 定时器配置 -->
		<bean id="deleteFileDetail" class="org.springframework.scheduling.quartz.JobDetailFactoryBean">
			<property name="jobClass" value="com.nc.wtdx.common.quartz.DeleteSftpFileQuartz" />
			<!-- 任务完成之后是否依然保留到数据库，默认false -->
			<property name="durability" value="false" />
			<property name="description" value="删除本地服务器上的附件" />
		</bean>
		
		
		<!-- 定义时间间隔触发器 -->
		<bean id="deleteFileTriggerBean" class="org.springframework.scheduling.quartz.CronTriggerFactoryBean"> 
			<property name="jobDetail" ref="deleteFileDetail" />
			<property name="cronExpression" value="0 0 0 * * ?" />
		</bean>
		
		
		<!-- 配置启动定时器 -->
		<bean id="schedulerFactory"  class="org.springframework.scheduling.quartz.SchedulerFactoryBean">
			<property name="triggers">
				<list>
					<!--这是需要被quartz调度的任务-->
					<!-- <ref bean="deleteFileTriggerBean"/>  -->
				</list>
			</property>
		</bean>
	
	
	</beans><?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
		xmlns:aop="http://www.springframework.org/schema/aop"
		xmlns:tx="http://www.springframework.org/schema/tx"
		xsi:schemaLocation="
	     http://www.springframework.org/schema/beans 
	     http://www.springframework.org/schema/beans/spring-beans.xsd
	     http://www.springframework.org/schema/tx
	     http://www.springframework.org/schema/tx/spring-tx.xsd
	     http://www.springframework.org/schema/aop 
	     http://www.springframework.org/schema/aop/spring-aop.xsd
	     http://www.springframework.org/schema/context
	     http://www.springframework.org/schema/context/spring-context.xsd">
		
		
		<!-- 定时器配置 -->
		<bean id="deleteFileDetail" class="org.springframework.scheduling.quartz.JobDetailFactoryBean">
			<property name="jobClass" value="com.nc.wtdx.common.quartz.DeleteSftpFileQuartz" />
			<!-- 任务完成之后是否依然保留到数据库，默认false -->
			<property name="durability" value="false" />
			<property name="description" value="删除本地服务器上的附件" />
		</bean>
		
		
		<!-- 定义时间间隔触发器 -->
		<bean id="deleteFileTriggerBean" class="org.springframework.scheduling.quartz.CronTriggerFactoryBean"> 
			<property name="jobDetail" ref="deleteFileDetail" />
			<property name="cronExpression" value="0 0 0 * * ?" />
		</bean>
		
		
		<!-- 配置启动定时器 -->
		<bean id="schedulerFactory"  class="org.springframework.scheduling.quartz.SchedulerFactoryBean">
			<property name="triggers">
				<list>
					<!--这是需要被quartz调度的任务-->
					<!-- <ref bean="deleteFileTriggerBean"/>  -->
				</list>
			</property>
		</bean>
	
	
	</beans><?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
		xmlns:aop="http://www.springframework.org/schema/aop"
		xmlns:tx="http://www.springframework.org/schema/tx"
		xsi:schemaLocation="
	     http://www.springframework.org/schema/beans 
	     http://www.springframework.org/schema/beans/spring-beans.xsd
	     http://www.springframework.org/schema/tx
	     http://www.springframework.org/schema/tx/spring-tx.xsd
	     http://www.springframework.org/schema/aop 
	     http://www.springframework.org/schema/aop/spring-aop.xsd
	     http://www.springframework.org/schema/context
	     http://www.springframework.org/schema/context/spring-context.xsd">
		
		
		<!-- 定时器配置 -->
		<bean id="deleteFileDetail" class="org.springframework.scheduling.quartz.JobDetailFactoryBean">
			<property name="jobClass" value="com.nc.wtdx.common.quartz.DeleteSftpFileQuartz" />
			<!-- 任务完成之后是否依然保留到数据库，默认false -->
			<property name="durability" value="false" />
			<property name="description" value="删除本地服务器上的附件" />
		</bean>
		
		
		<!-- 定义时间间隔触发器 -->
		<bean id="deleteFileTriggerBean" class="org.springframework.scheduling.quartz.CronTriggerFactoryBean"> 
			<property name="jobDetail" ref="deleteFileDetail" />
			<property name="cronExpression" value="0 0 0 * * ?" />
		</bean>
		
		
		<!-- 配置启动定时器 -->
		<bean id="schedulerFactory"  class="org.springframework.scheduling.quartz.SchedulerFactoryBean">
			<property name="triggers">
				<list>
					<!--这是需要被quartz调度的任务-->
					<!-- <ref bean="deleteFileTriggerBean"/>  -->
				</list>
			</property>
		</bean>
	
	
	</beans><?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
		xmlns:aop="http://www.springframework.org/schema/aop"
		xmlns:tx="http://www.springframework.org/schema/tx"
		xsi:schemaLocation="
	     http://www.springframework.org/schema/beans 
	     http://www.springframework.org/schema/beans/spring-beans.xsd
	     http://www.springframework.org/schema/tx
	     http://www.springframework.org/schema/tx/spring-tx.xsd
	     http://www.springframework.org/schema/aop 
	     http://www.springframework.org/schema/aop/spring-aop.xsd
	     http://www.springframework.org/schema/context
	     http://www.springframework.org/schema/context/spring-context.xsd">
		
		
		<!-- 定时器配置 -->
		<bean id="deleteFileDetail" class="org.springframework.scheduling.quartz.JobDetailFactoryBean">
			<property name="jobClass" value="com.nc.wtdx.common.quartz.DeleteSftpFileQuartz" />
			<!-- 任务完成之后是否依然保留到数据库，默认false -->
			<property name="durability" value="false" />
			<property name="description" value="删除本地服务器上的附件" />
		</bean>
		
		
		<!-- 定义时间间隔触发器 -->
		<bean id="deleteFileTriggerBean" class="org.springframework.scheduling.quartz.CronTriggerFactoryBean"> 
			<property name="jobDetail" ref="deleteFileDetail" />
			<property name="cronExpression" value="0 0 0 * * ?" />
		</bean>
		
		
		<!-- 配置启动定时器 -->
		<bean id="schedulerFactory"  class="org.springframework.scheduling.quartz.SchedulerFactoryBean">
			<property name="triggers">
				<list>
					<!--这是需要被quartz调度的任务-->
					<!-- <ref bean="deleteFileTriggerBean"/>  -->
				</list>
			</property>
		</bean>
	
	
	</beans><?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
		xmlns:aop="http://www.springframework.org/schema/aop"
		xmlns:tx="http://www.springframework.org/schema/tx"
		xsi:schemaLocation="
	     http://www.springframework.org/schema/beans 
	     http://www.springframework.org/schema/beans/spring-beans.xsd
	     http://www.springframework.org/schema/tx
	     http://www.springframework.org/schema/tx/spring-tx.xsd
	     http://www.springframework.org/schema/aop 
	     http://www.springframework.org/schema/aop/spring-aop.xsd
	     http://www.springframework.org/schema/context
	     http://www.springframework.org/schema/context/spring-context.xsd">
		
		
		<!-- 定时器配置 -->
		<bean id="deleteFileDetail" class="org.springframework.scheduling.quartz.JobDetailFactoryBean">
			<property name="jobClass" value="com.nc.wtdx.common.quartz.DeleteSftpFileQuartz" />
			<!-- 任务完成之后是否依然保留到数据库，默认false -->
			<property name="durability" value="false" />
			<property name="description" value="删除本地服务器上的附件" />
		</bean>
		
		
		<!-- 定义时间间隔触发器 -->
		<bean id="deleteFileTriggerBean" class="org.springframework.scheduling.quartz.CronTriggerFactoryBean"> 
			<property name="jobDetail" ref="deleteFileDetail" />
			<property name="cronExpression" value="0 0 0 * * ?" />
		</bean>
		
		
		<!-- 配置启动定时器 -->
		<bean id="schedulerFactory"  class="org.springframework.scheduling.quartz.SchedulerFactoryBean">
			<property name="triggers">
				<list>
					<!--这是需要被quartz调度的任务-->
					<!-- <ref bean="deleteFileTriggerBean"/>  -->
				</list>
			</property>
		</bean>
	
	
	</beans>
}

