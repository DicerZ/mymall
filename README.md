# mymall
mall商城购物系统学习

始于2019-10-17

## 实现功能

### 商品

- 商品品牌管理

1. 添加品牌
2. 删除品牌
3. 更新品牌
4. 查询品牌
5. 获取品牌列表

- 商品属性分类管理

1. 添加商品属性分类
2. 删除商品属性分类
3. 查询商品属性分类
4. 更新商品属性分类
5. 获取商品属性分类及其属性

- 商品属性管理

1. 添加商品属性
2. 删除商品属性
3. 查询单个商品属性
4. 根据类别查询属性列表或参数列表
5. 根据类别查询属性及属性分类
6. 更新商品属性

- 商品分类管理

1. 添加商品分类
2. 删除商品分类
3. 查询商品分类
4. 查询所有一级分类及子分类
5. 更新商品分类
6. 修改导航栏显示状态
7. 修改显示状态

- 商品管理

1. 添加商品
2. 批量修改删除状态
3. 批量设为新品
4. 批量推荐商品
5. 批量上下架
6. 批量修改审核状态
7. 查询商品
8. 根据商品id获取商品编辑信息
9. 根据商品名称或货号模糊查询
10. 更新商品

- sku商品库存管理

1. 查询sku库存
2. 批量更新库存信息

### 营销

- 优惠券管理

1. 添加优惠券
2. 删除优惠券
3. 更新优惠券
4. 查询优惠券

- 限时购活动管理

1. 添加活动
2. 删除活动
3. 更新活动
4. 修改上下线状态
5. 查询活动

- 限时购和商品关系管理

1. 批量选择商品添加关联
2. 修改关联相关信息
3. 删除关联
4. 获取管理商品促销信息
5. 分页查询不同场次关联及商品信息

- 限时购场次管理

1. 添加场次
2. 删除场次
3. 修改场次
4. 获取场次

- 首页轮播广告管理

1. 添加广告
2. 删除广告
3. 修改广告
4. 查询广告

- 首页品牌管理

1. 添加首页推荐品牌
2. 删除推荐品牌
3. 修改品牌排序
4. 修改推荐状态
5. 分页查询推荐品牌

- 首页新品管理

1. 添加首页推荐品牌
2. 修改推荐排序
3. 批量删除推荐
4. 批量修改推荐状态
5. 分页查询推荐

- 首页人气推荐管理

1. 添加首页推荐
2. 修改推荐排序
3. 批量修改推荐
4. 更新推荐状态
5. 分页查询推荐

- 首页专题推荐管理

1. 添加首页推荐专题
2. 修改推荐排序
3. 批量删除推荐
4. 批量修改推荐
5. 分页查询推荐

- 优惠券领取记录管理

1.根据优惠券id、使用状态和订单编号分页获取领取记录

### 用户

- 会员登录注册管理

1. 获取验证码
2. 检验验证码正确性

- 后台用户管理

1. 用户注册
2. 登录后返回token
3. 刷新token
4. 获取当前登录用户信息
5. 登出
6. 根据用户名或姓名分页获取用户列表
7. 获取指定用户信息
8. 修改指定用户信息
9. 修改指定用户密码
10. 删除指定用户信息
11. 给用户分配角色
12. 获取指定用户的角色
13. 更新用户权限
14. 获取用户所有权限

- 会员等级管理

1. 查询所有会员等级

- 后台用户权限管理

1. 添加权限
2. 修改权限
3. 根据id批量删除权限
4. 以层级结构返回所有权限
5. 获取所有权限列表

- 后台用户角色管理

1. 添加角色
2. 修改角色
3. 批量删除角色
4. 获取相应角色权限
5. 修改角色权限
6. 获取所有角色

### 内容

- 商品专题管理

1. 获取全部商品专题
2. 根据专题名称分页获取专题

- 商品优选管理

1. 获取所有商品优选

### 订单

- 收货地址管理

1. 获取所有收货地址

- 订单管理

1. 查询订单
2. 批量发货
3. 批量关闭订单
4. 批量删除订单
5. 获取订单详情
6. 修改收货人信息
7. 修改订单费用信息
8. 备注订单

- 订单退货申请管理

1. 分页查询退货申请
2. 批量删除申请
3. 获取退货申请详情
4. 修改申请状态

- 退货原因管理

1. 添加退货管理
2. 修改退货原因
3. 批量删除退货原因
4. 分页查询退货原因
5. 获取单个退货原因详情信息
6. 修改退货原因启用状态

- 订单设置管理

1. 获取指定订单设置
2. 修改指定订单设置

## 引用技术

- SpringBoot
- Mybatis
- Swagger-UI
- Redis
- SpringSecurity
- JWT
