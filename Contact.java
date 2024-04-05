package contacts;

class Contacts {
    private String name;
    private String number;
    public void Contact(String name) {
        this.name = name;
        number = null;
    }

    public Contacts(String name) {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    
    public boolean equals(Object o) {
        if (!(o instanceof Contacts)) {
            return false;
        }
        Contacts contact = (Contacts
                ) o;
        return contact.name.equals(this.name);
    }


    public int getNumber() {
        return 0;
    }}
