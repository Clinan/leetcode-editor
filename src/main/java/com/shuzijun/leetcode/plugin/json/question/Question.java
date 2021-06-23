
package com.shuzijun.leetcode.plugin.json.question;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "questionId",
    "questionFrontendId",
    "boundTopicId",
    "title",
    "titleSlug",
    "content",
    "translatedTitle",
    "translatedContent",
    "isPaidOnly",
    "difficulty",
    "likes",
    "dislikes",
    "isLiked",
    "similarQuestions",
    "contributors",
    "langToValidPlayground",
    "topicTags",
    "companyTagStats",
    "codeSnippets",
    "stats",
    "hints",
    "solution",
    "status",
    "sampleTestCase",
    "metaData",
    "judgerAvailable",
    "judgeType",
    "mysqlSchemas",
    "enableRunCode",
    "enableTestMode",
    "envInfo",
    "__typename"
})
@Generated("jsonschema2pojo")
public class Question {

    @JsonProperty("questionId")
    public String questionId;
    @JsonProperty("questionFrontendId")
    public String questionFrontendId;
    @JsonProperty("boundTopicId")
    public Long boundTopicId;
    @JsonProperty("title")
    public String title;
    @JsonProperty("titleSlug")
    public String titleSlug;
    @JsonProperty("content")
    public String content;
    @JsonProperty("translatedTitle")
    public String translatedTitle;
    @JsonProperty("translatedContent")
    public String translatedContent;
    @JsonProperty("isPaidOnly")
    public Boolean isPaidOnly;
    @JsonProperty("difficulty")
    public String difficulty;
    @JsonProperty("likes")
    public Long likes;
    @JsonProperty("dislikes")
    public Long dislikes;
    @JsonProperty("isLiked")
    public Object isLiked;
    @JsonProperty("similarQuestions")
    public String similarQuestions;
    @JsonProperty("contributors")
    public List<Object> contributors = null;
    @JsonProperty("langToValidPlayground")
    public String langToValidPlayground;
    @JsonProperty("topicTags")
    public List<TopicTag> topicTags = null;
    @JsonProperty("companyTagStats")
    public Object companyTagStats;
    @JsonProperty("codeSnippets")
    public List<CodeSnippet> codeSnippets = null;
    @JsonProperty("stats")
    public String stats;
    @JsonProperty("hints")
    public List<String> hints = null;
    @JsonProperty("solution")
    public Solution solution;
    @JsonProperty("status")
    public Object status;
    @JsonProperty("sampleTestCase")
    public String sampleTestCase;
    @JsonProperty("metaData")
    public String metaData;
    @JsonProperty("judgerAvailable")
    public Boolean judgerAvailable;
    @JsonProperty("judgeType")
    public String judgeType;
    @JsonProperty("mysqlSchemas")
    public List<Object> mysqlSchemas = null;
    @JsonProperty("enableRunCode")
    public Boolean enableRunCode;
    @JsonProperty("enableTestMode")
    public Boolean enableTestMode;
    @JsonProperty("envInfo")
    public String envInfo;
    @JsonProperty("__typename")
    public String typename;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
