package com.itag.api.server.v1.register.biz;

import com.itag.api.server.v1.register.model.BaseModel;

public abstract class RegistrationBOF {
	public abstract UserBo register(RegistrationBo bo);
	public abstract RegistrationBo mapModelToBo(BaseModel model);
	public abstract BaseModel mapBoToModel(BaseBo bo);
}
