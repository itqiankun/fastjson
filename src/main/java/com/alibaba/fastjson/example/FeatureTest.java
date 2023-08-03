package com.alibaba.fastjson.example;

import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: ma_qiankun
 * @date: 2023/8/3
 **/
public class FeatureTest {
	private static final Logger logger = LoggerFactory.getLogger(FeatureTest.class);


	@Test
	public void test2 (){
		int features = 0;
		features |= Feature.AutoCloseSource.getMask();
		features |= Feature.InternFieldNames.getMask();
		features |= Feature.UseBigDecimal.getMask();
		features |= Feature.AllowUnQuotedFieldNames.getMask();
		features |= Feature.AllowSingleQuotes.getMask();
		features |= Feature.AllowArbitraryCommas.getMask();
		features |= Feature.SortFeidFastMatch.getMask();
		features |= Feature.IgnoreNotMatch.getMask();

		logger.info("DEFAULT_PARSER_FEATURE值:{}", features);
	}
	@Test
	public void test23 (){
		int features = 0;
		features |= SerializerFeature.QuoteFieldNames.getMask();
		features |= SerializerFeature.SkipTransientField.getMask();
		features |= SerializerFeature.WriteEnumUsingName.getMask();
		features |= SerializerFeature.SortField.getMask();

		logger.info("DEFAULT_GENERATE_FEATURE值:{}", features);
	}
}
