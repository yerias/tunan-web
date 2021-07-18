package com.tunan.aspectj.server;

import com.tunan.aspectj.dao.UserRepository;
import com.tunan.aspectj.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

@Service
// 声明事物管理
@Transactional
public class AspectJServer {

    @Autowired
    private UserRepository userRepository;

    public void save(User user){
        try {
            userRepository.save(user);
            System.out.println(1/0);
        } catch (Exception e){
            // 隐藏错误的堆栈信息
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
    }
}