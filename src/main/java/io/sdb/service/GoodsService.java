/**
 * Copyright 2018
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package io.sdb.service;

import io.sdb.common.utils.R;
import io.sdb.form.GoodsData;
import io.sdb.form.GoodsParaData;
import io.sdb.form.GoodsSpecData;
import io.sdb.common.utils.PageUtils;
import io.sdb.model.Goods;

import java.util.List;
import java.util.Map;


/**
 * 系统日志
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-08 10:40:56
 */
public interface GoodsService extends BaseService<Goods> {
    PageUtils queryPage(Map<String, Object> params);
    Goods saveUpdateGoods(GoodsData goods, List<GoodsParaData> paraList, List<GoodsSpecData> specList);
    R batchShelf(String[] ids);
    R batchObtained(String[] ids);
}