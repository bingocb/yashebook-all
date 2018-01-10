package com.yashebook.domain.po;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
* Book
* table:ys_book
* 
* @author chenbin
* @version v1.0
* @copy pet
* @date 2018-01-10 11:51:19
*/
public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String isbn;

    private String author;

    private String authorIntroduction;

    private String bookFolio;

    private String bookFonts;

    private String bookName;

    private String bookPage;

    private String bookSn;

    private String bookVersion;

    private String catalog;

    private String comment;

    private String content;

    private String contentIntroduction;

    private String covers;

    private Date createTime;

    private String editorRecommend;

    private Integer isFull;

    private String material;

    private Date modifyTime;

    private String packType;

    private String pressName;

    private Date printTime;

    private String publishingTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthorIntroduction() {
        return authorIntroduction;
    }

    public void setAuthorIntroduction(String authorIntroduction) {
        this.authorIntroduction = authorIntroduction;
    }

    public String getBookFolio() {
        return bookFolio;
    }

    public void setBookFolio(String bookFolio) {
        this.bookFolio = bookFolio;
    }

    public String getBookFonts() {
        return bookFonts;
    }

    public void setBookFonts(String bookFonts) {
        this.bookFonts = bookFonts;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookPage() {
        return bookPage;
    }

    public void setBookPage(String bookPage) {
        this.bookPage = bookPage;
    }

    public String getBookSn() {
        return bookSn;
    }

    public void setBookSn(String bookSn) {
        this.bookSn = bookSn;
    }

    public String getBookVersion() {
        return bookVersion;
    }

    public void setBookVersion(String bookVersion) {
        this.bookVersion = bookVersion;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentIntroduction() {
        return contentIntroduction;
    }

    public void setContentIntroduction(String contentIntroduction) {
        this.contentIntroduction = contentIntroduction;
    }

    public String getCovers() {
        return covers;
    }

    public void setCovers(String covers) {
        this.covers = covers;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getEditorRecommend() {
        return editorRecommend;
    }

    public void setEditorRecommend(String editorRecommend) {
        this.editorRecommend = editorRecommend;
    }

    public Integer getIsFull() {
        return isFull;
    }

    public void setIsFull(Integer isFull) {
        this.isFull = isFull;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getPackType() {
        return packType;
    }

    public void setPackType(String packType) {
        this.packType = packType;
    }

    public String getPressName() {
        return pressName;
    }

    public void setPressName(String pressName) {
        this.pressName = pressName;
    }

    public Date getPrintTime() {
        return printTime;
    }

    public void setPrintTime(Date printTime) {
        this.printTime = printTime;
    }

    public String getPublishingTime() {
        return publishingTime;
    }

    public void setPublishingTime(String publishingTime) {
        this.publishingTime = publishingTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Book other = (Book) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getIsbn() == null ? other.getIsbn() == null : this.getIsbn().equals(other.getIsbn()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getAuthorIntroduction() == null ? other.getAuthorIntroduction() == null : this.getAuthorIntroduction().equals(other.getAuthorIntroduction()))
            && (this.getBookFolio() == null ? other.getBookFolio() == null : this.getBookFolio().equals(other.getBookFolio()))
            && (this.getBookFonts() == null ? other.getBookFonts() == null : this.getBookFonts().equals(other.getBookFonts()))
            && (this.getBookName() == null ? other.getBookName() == null : this.getBookName().equals(other.getBookName()))
            && (this.getBookPage() == null ? other.getBookPage() == null : this.getBookPage().equals(other.getBookPage()))
            && (this.getBookSn() == null ? other.getBookSn() == null : this.getBookSn().equals(other.getBookSn()))
            && (this.getBookVersion() == null ? other.getBookVersion() == null : this.getBookVersion().equals(other.getBookVersion()))
            && (this.getCatalog() == null ? other.getCatalog() == null : this.getCatalog().equals(other.getCatalog()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getContentIntroduction() == null ? other.getContentIntroduction() == null : this.getContentIntroduction().equals(other.getContentIntroduction()))
            && (this.getCovers() == null ? other.getCovers() == null : this.getCovers().equals(other.getCovers()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getEditorRecommend() == null ? other.getEditorRecommend() == null : this.getEditorRecommend().equals(other.getEditorRecommend()))
            && (this.getIsFull() == null ? other.getIsFull() == null : this.getIsFull().equals(other.getIsFull()))
            && (this.getMaterial() == null ? other.getMaterial() == null : this.getMaterial().equals(other.getMaterial()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getPackType() == null ? other.getPackType() == null : this.getPackType().equals(other.getPackType()))
            && (this.getPressName() == null ? other.getPressName() == null : this.getPressName().equals(other.getPressName()))
            && (this.getPrintTime() == null ? other.getPrintTime() == null : this.getPrintTime().equals(other.getPrintTime()))
            && (this.getPublishingTime() == null ? other.getPublishingTime() == null : this.getPublishingTime().equals(other.getPublishingTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getIsbn() == null) ? 0 : getIsbn().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getAuthorIntroduction() == null) ? 0 : getAuthorIntroduction().hashCode());
        result = prime * result + ((getBookFolio() == null) ? 0 : getBookFolio().hashCode());
        result = prime * result + ((getBookFonts() == null) ? 0 : getBookFonts().hashCode());
        result = prime * result + ((getBookName() == null) ? 0 : getBookName().hashCode());
        result = prime * result + ((getBookPage() == null) ? 0 : getBookPage().hashCode());
        result = prime * result + ((getBookSn() == null) ? 0 : getBookSn().hashCode());
        result = prime * result + ((getBookVersion() == null) ? 0 : getBookVersion().hashCode());
        result = prime * result + ((getCatalog() == null) ? 0 : getCatalog().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getContentIntroduction() == null) ? 0 : getContentIntroduction().hashCode());
        result = prime * result + ((getCovers() == null) ? 0 : getCovers().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getEditorRecommend() == null) ? 0 : getEditorRecommend().hashCode());
        result = prime * result + ((getIsFull() == null) ? 0 : getIsFull().hashCode());
        result = prime * result + ((getMaterial() == null) ? 0 : getMaterial().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getPackType() == null) ? 0 : getPackType().hashCode());
        result = prime * result + ((getPressName() == null) ? 0 : getPressName().hashCode());
        result = prime * result + ((getPrintTime() == null) ? 0 : getPrintTime().hashCode());
        result = prime * result + ((getPublishingTime() == null) ? 0 : getPublishingTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}