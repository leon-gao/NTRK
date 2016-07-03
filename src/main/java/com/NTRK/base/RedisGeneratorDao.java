package com.NTRK.base;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Controller;

@Controller
public abstract class RedisGeneratorDao<K extends Serializable, V extends Serializable> {
	
	private static final Logger logger = LoggerFactory.getLogger(RedisGeneratorDao.class);
	
	@Autowired
    protected RedisTemplate<K,V> redisTemplate ;

    /** 
     * …Ë÷√redisTemplate 
     * @param redisTemplate the redisTemplate to set 
     */  
    public void setRedisTemplate(RedisTemplate<K, V> redisTemplate) {  
        this.redisTemplate = redisTemplate;  
    }  
      
    /** 
     * ªÒ»° RedisSerializer 
     * <br>------------------------------<br> 
     */  
    protected RedisSerializer<String> getRedisSerializer() {  
        return redisTemplate.getStringSerializer();  
    } 
}
