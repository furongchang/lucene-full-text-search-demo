package org.example;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.IntPoint;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.*;
import org.apache.lucene.search.*;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class index {
    public static final String date="C:\\Users\\付荣畅\\Desktop\\lucene\\hello.txt";
    public static final String index="C:\\Users\\付荣畅\\Desktop\\lucene";
    //@Test
    public void test1()throws Exception{
        //Directory directory = FSDirectory.open(Paths.get(date));
        FSDirectory directory=FSDirectory.open(Paths.get(index));
        Analyzer analyzer = new StandardAnalyzer();
        IndexWriterConfig iwConfig = new IndexWriterConfig(analyzer);
        IndexWriter writer=new IndexWriter(directory,iwConfig);
        BufferedReader in = new BufferedReader(new FileReader(date));
        String line = "";
        List<String> lines=new ArrayList<>();
        while((line = in.readLine())!=null){
            lines.add(line);
        }
        for(String l:lines){
            String[] split=l.split(",");
            String id=split[0];
            String name=split[1];
            String brand=split[2];
            String classes=split[3];
            String num=split[4];
            String price=split[5];
            Document document=new Document();
            document.add(new IntPoint("id",Integer.parseInt(id)));
            document.add(new TextField("name",name, Field.Store.YES));
            document.add(new TextField("brand",brand, Field.Store.YES));
            document.add(new TextField("classes",classes, Field.Store.YES));
            document.add(new TextField("num",num, Field.Store.YES));
            document.add(new TextField("price",price, Field.Store.YES));
            writer.addDocument(document);
        }
        writer.flush();
        writer.commit();
        System.out.println("共索引："+writer.numDocs()+"条");
        writer.close();
        directory.close();
    }

    //@Test
    public String test2(String n)throws Exception{
        FSDirectory directory=FSDirectory.open(Paths.get(index));
        IndexReader ir = DirectoryReader.open(directory);
        IndexSearcher searcher=new IndexSearcher(ir);
        Term term =new Term("name",n);//查询语句
        Query query=new TermQuery(term);
        TopDocs topDocs=searcher.search(query,1000);
        System.out.println("共搜索到"+topDocs.totalHits+"条");
        ScoreDoc[] scoreDocs=topDocs.scoreDocs;
        StringBuilder sb=new StringBuilder();
        for(ScoreDoc scoreDoc : scoreDocs) {
            int docId = scoreDoc.doc;
            Document document = searcher.doc(docId);
            sb.append("ID:").append(docId).append("  ")
                    .append("name:").append(document.get("name")).append("  ")
                    .append("brand:").append(document.get("brand")).append("  ")
                    .append("classes:").append(document.get("classes")).append("  ")
                    .append("num:").append(document.get("num")).append("  ")
                    .append("price:").append(document.get("price")).append("  ");
        }return sb.toString();
    }
}
