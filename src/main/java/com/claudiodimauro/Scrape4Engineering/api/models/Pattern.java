package com.claudiodimauro.Scrape4Engineering.api.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "pattern")
@ApiModel(description = "")
public class Pattern {

    @Id
    @ApiModelProperty(notes = "")
    private String url;//id = website url
    @ApiModelProperty(notes = "")
    private String tagForBody;
    @ApiModelProperty(notes = "")
    private String entityId;
    @ApiModelProperty(notes = "")
    private String entityPath;//(href)
    @ApiModelProperty(notes = "")
    private String attrForEntityId;
    @ApiModelProperty(notes = "")
    private Boolean hasPrescraping = false;
    @ApiModelProperty(notes = "")
    private String tagForPrescraping;
    @ApiModelProperty(notes = "")
    private Boolean haveToExplore = false;
    @ApiModelProperty(notes = "")
    private List<PatternObject> patternObjects;
    @ApiModelProperty(notes = "")
    private List<PatternObject> innerPatternObjects;
    @ApiModelProperty(notes = "")
    private String tagForInnerBody;
    @ApiModelProperty(notes = "")
    private Boolean hasAttachments = false;
    @ApiModelProperty(notes = "")
    private List<AttachmentObject> attachmentObject;
    @ApiModelProperty(notes = "")
    private Boolean hasInnerAttachments = false;
    @ApiModelProperty(notes = "")
    private List<AttachmentObject> attachmentInnerObject;
    
    public Pattern() {
        this.patternObjects = new ArrayList<>();
        this.innerPatternObjects = new ArrayList<>();
        this.attachmentObject = new ArrayList<>();
        this.attachmentInnerObject = new ArrayList<>();
    }
}
