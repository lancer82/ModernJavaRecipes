package enums;

public enum Color {
	RED("��ɫ",1),GREEN("��ɫ",2),YELLOW("��ɫ",3),WHITE("��ɫ",4);
	//��Ա����
	private final String name;
	private int index;
	//���췽��
	private Color(String name,int index) {
		this.name = name;
		this.index = index;
	}
	//���Ƿ���
	@Override
	public String toString() {
		return this.index + "-" + this.name;
	}
}
