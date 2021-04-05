/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halt.updateRecord;


import java.sql.Timestamp;

/**
 *
 * @author Luong Thanh Ha
 */
public class UpdateRecordDTO {
    String productId;
    String userId;
    Timestamp updateTime;

    public UpdateRecordDTO(String productId, String userId, Timestamp updateTime) {
        this.productId = productId;
        this.userId = userId;
        this.updateTime = updateTime;
    }

    
    
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "UpdateRecordDTO{" + "productId=" + productId + ", userId=" + userId + ", updateTime=" + updateTime + '}';
    }

    
    
    
}
