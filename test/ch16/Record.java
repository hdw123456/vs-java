package test.ch16;




public class Record {
    @FMP_Annotation(describe = "编号", type = int.class)
    int id;
    @FMP_Annotation(describe = "姓名", type = String.class)
    String name;
    @Constructor_Annotation()
    public Record() {
    }

    @Constructor_Annotation("初始化构造方法")
    public Record(@FMP_Annotation(describe = "编号", type = int.class) int id,
            @FMP_Annotation(describe = "姓名", type = String.class) String name) {
        this.id = id;
        this.name = name;
    }

    @FMP_Annotation(describe = "获得编号", type = int.class)
    public int getid() {
        return id;
    }

    @FMP_Annotation(describe = "设置编号", type = int.class)
    public void setid(@FMP_Annotation(describe = "编号", type = int.class) int id) {
        this.id = id;
    }

    @FMP_Annotation(describe = "获得姓名", type = String.class)
    public String getname() {
        return name;
    }

    @FMP_Annotation(describe = "设置姓名", type = String.class)
    public void setname(@FMP_Annotation(describe = "姓名", type = String.class) String name) {
        this.name = name;
    }
}
