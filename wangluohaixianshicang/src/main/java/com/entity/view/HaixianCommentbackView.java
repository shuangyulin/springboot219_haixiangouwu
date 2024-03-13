package com.entity.view;

import com.entity.HaixianCommentbackEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 商品评价
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("haixian_commentback")
public class HaixianCommentbackView extends HaixianCommentbackEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 haixian
			/**
			* 商品名称
			*/
			private String haixianName;
			/**
			* 商品照片
			*/
			private String haixianPhoto;
			/**
			* 视频演示
			*/
			private String haixianVideo;
			/**
			* 商品类型
			*/
			private Integer haixianTypes;
				/**
				* 商品类型的值
				*/
				private String haixianValue;
			/**
			* 商品库存
			*/
			private Integer haixianKucunNumber;
			/**
			* 商品原价
			*/
			private Double haixianOldMoney;
			/**
			* 现价
			*/
			private Double haixianNewMoney;
			/**
			* 点击次数
			*/
			private Integer haixianClicknum;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer haixianDelete;
			/**
			* 商品简介
			*/
			private String haixianContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;

	public HaixianCommentbackView() {

	}

	public HaixianCommentbackView(HaixianCommentbackEntity haixianCommentbackEntity) {
		try {
			BeanUtils.copyProperties(this, haixianCommentbackEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



















				//级联表的get和set haixian

					/**
					* 获取： 商品名称
					*/
					public String getHaixianName() {
						return haixianName;
					}
					/**
					* 设置： 商品名称
					*/
					public void setHaixianName(String haixianName) {
						this.haixianName = haixianName;
					}

					/**
					* 获取： 商品照片
					*/
					public String getHaixianPhoto() {
						return haixianPhoto;
					}
					/**
					* 设置： 商品照片
					*/
					public void setHaixianPhoto(String haixianPhoto) {
						this.haixianPhoto = haixianPhoto;
					}

					/**
					* 获取： 视频演示
					*/
					public String getHaixianVideo() {
						return haixianVideo;
					}
					/**
					* 设置： 视频演示
					*/
					public void setHaixianVideo(String haixianVideo) {
						this.haixianVideo = haixianVideo;
					}

					/**
					* 获取： 商品类型
					*/
					public Integer getHaixianTypes() {
						return haixianTypes;
					}
					/**
					* 设置： 商品类型
					*/
					public void setHaixianTypes(Integer haixianTypes) {
						this.haixianTypes = haixianTypes;
					}


						/**
						* 获取： 商品类型的值
						*/
						public String getHaixianValue() {
							return haixianValue;
						}
						/**
						* 设置： 商品类型的值
						*/
						public void setHaixianValue(String haixianValue) {
							this.haixianValue = haixianValue;
						}

					/**
					* 获取： 商品库存
					*/
					public Integer getHaixianKucunNumber() {
						return haixianKucunNumber;
					}
					/**
					* 设置： 商品库存
					*/
					public void setHaixianKucunNumber(Integer haixianKucunNumber) {
						this.haixianKucunNumber = haixianKucunNumber;
					}

					/**
					* 获取： 商品原价
					*/
					public Double getHaixianOldMoney() {
						return haixianOldMoney;
					}
					/**
					* 设置： 商品原价
					*/
					public void setHaixianOldMoney(Double haixianOldMoney) {
						this.haixianOldMoney = haixianOldMoney;
					}

					/**
					* 获取： 现价
					*/
					public Double getHaixianNewMoney() {
						return haixianNewMoney;
					}
					/**
					* 设置： 现价
					*/
					public void setHaixianNewMoney(Double haixianNewMoney) {
						this.haixianNewMoney = haixianNewMoney;
					}

					/**
					* 获取： 点击次数
					*/
					public Integer getHaixianClicknum() {
						return haixianClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setHaixianClicknum(Integer haixianClicknum) {
						this.haixianClicknum = haixianClicknum;
					}

					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getHaixianDelete() {
						return haixianDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setHaixianDelete(Integer haixianDelete) {
						this.haixianDelete = haixianDelete;
					}

					/**
					* 获取： 商品简介
					*/
					public String getHaixianContent() {
						return haixianContent;
					}
					/**
					* 设置： 商品简介
					*/
					public void setHaixianContent(String haixianContent) {
						this.haixianContent = haixianContent;
					}













				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}



}
