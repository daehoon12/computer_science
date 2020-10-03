import java.util.Date;

class FileInfo{
    String name;
    String type;
    int size;
    Date modified;
    public FileInfo(String name, String type, int size, Date modified)
    {
        this.name = name;
        this.type = type;
        this.size = size;
        this.modified = modified;
    }

    public String getName()
    {
        return name;
    }

    public String getType()
    {
        return type;
    }
    public int getSize()
    {
        return size;
    }
    public Date getModifiedDate()
    {
        return modified;
    }

    @Override
    public String toString() {
        return "Name : " + name + '\n' +
                "Type : " + type + '\n' +
                "Size : " + size + '\n' +
                "Modified : " + modified + '\n';
    }
}