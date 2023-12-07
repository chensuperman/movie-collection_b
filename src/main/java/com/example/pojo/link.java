package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class link {
    //创建一个类来单独表示用户和电影的连接关系

        private Integer userId;
        private Integer movieId;

        // 省略构造函数和getter/setter

}
