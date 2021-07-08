package com.groovyexample.groovy.bean;

import java.util.Date;
import lombok.Data;
import org.apache.commons.lang.StringUtils;

/**
 * script DTO
 */
public class StrategyScriptEntity {
  /**
   * 策略id
   */
  private Integer strategyId;

  public Integer getStrategyId() {
    return strategyId;
  }

  public StrategyScriptEntity setStrategyId(Integer strategyId) {
    this.strategyId = strategyId;
    return this;
  }

  public String getScript() {
    return script;
  }

  public StrategyScriptEntity setScript(String script) {
    this.script = script;
    return this;
  }

  public String getVariables() {
    return variables;
  }

  public StrategyScriptEntity setVariables(String variables) {
    this.variables = variables;
    return this;
  }

  public String getAuthor() {
    return author;
  }

  public StrategyScriptEntity setAuthor(String author) {
    this.author = author;
    return this;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public StrategyScriptEntity setCreateTime(Date createTime) {
    this.createTime = createTime;
    return this;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public StrategyScriptEntity setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * 脚本内容
   */
  private String script;

  /**
   * 变量名称，类型json
   */
  private String variables;

  /**
   * 作者
   */
  private String author;

  /**
   * 创建时间
   */
  private Date createTime;

  /**
   * 更新时间
   */
  private Date updateTime;

}