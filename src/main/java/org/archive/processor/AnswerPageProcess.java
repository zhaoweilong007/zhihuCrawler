package org.archive.processor;

import org.archive.constant.CrawlerConstants;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.handler.PatternProcessor;
import us.codecraft.webmagic.selector.CssSelector;
import us.codecraft.webmagic.selector.Html;
import us.codecraft.webmagic.selector.Selectable;

/**
 * 爬取回答详情
 *
 * @author ZhaoWeiLong
 */
public class AnswerPageProcess extends PatternProcessor {

    private final CssSelector cssSelector = new CssSelector("span.RichText.ztext.CopyrightRichText-richText.css-jflero");

    public AnswerPageProcess() {
        super(CrawlerConstants.ANSWER_PAGE_URL_PATTERN);
    }

    @Override
    public MatchOther processPage(Page page) {
        final Html html = page.getHtml();
        final Selectable selected = html.select(cssSelector);
        if (selected == null) {
            return MatchOther.NO;
        } else {
            final String content = selected.toString();
            page.putField(CrawlerConstants.ANSWER_CONTENT_KEY, content);
            return MatchOther.YES;
        }
    }

    @Override
    public MatchOther processResult(ResultItems resultItems, Task task) {
        return null;
    }
}
