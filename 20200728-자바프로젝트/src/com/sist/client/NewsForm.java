package com.sist.client;

import java.util.*;
import com.sist.data.*;
import java.awt.*;
import javax.swing.*;

public class NewsForm extends JPanel {

	public NewsForm() {
		NewsManager m=new NewsManager();
		ArrayList<NewsVO> news=m.newsListData(1);
		setLayout(new GridLayout(5, 1));
		
		for(NewsVO vo:news) {
			NewsCard nc=new NewsCard();
			nc.newsPrint(vo);
			add(nc);
		}
	}
	
}
