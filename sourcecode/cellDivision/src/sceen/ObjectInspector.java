package sceen;

	import java.lang.reflect.Field;
import java.util.ArrayList;

import javafx.scene.image.Image;
import model.prokaryoticCell;

	public class ObjectInspector {
	    public static void inspect(Object obj) {
	        Class<?> clazz = obj.getClass();

	        System.out.println("Inspecting class: " + clazz.getName());

	        // Lấy tất cả các trường của lớp
	        Field[] fields = clazz.getDeclaredFields();

	        for (Field field : fields) {
	            field.setAccessible(true); // Cho phép truy cập trường private
	            String fieldName = field.getName();
	            Object value;

	            try {
	                value = field.get(obj);
	            } catch (IllegalAccessException e) {
	                value = "Cannot access the field";
	            }
System.out.println("Field: " + fieldName + ", Value: " + value);
	            
	        }
	    }

	    public static void main(String[] args) {
	        // Tạo một đối tượng để kiểm tra
	        
	        prokaryoticCell pro = new prokaryoticCell();

	        // Gọi phương thức inspect để hiển thị thông tin về đối tượng
	        inspect(pro);
		        int i = 0;
		       ArrayList<Image> Amitosis = new ArrayList<Image>(); // You can change 10 to the desired size
		        do {
				    try {
				        Amitosis.add(new Image("/image/prokaryotic/amitosis/phase0.png"));
				        i++;
				        System.out.println("Ok" + i);
				    } catch (Exception e) {
				        /// In thông báo lỗi
				        System.out.println("Lỗi khi tải ảnh: " + e.getMessage());
				        // Exit vòng l
				        break;
				    }
				} while (true);
		        
		        System.out.println(Amitosis.size());
		        for (Image image : Amitosis) {
		            // Sử dụng đối tượng 'image' theo cần thiết
		            // Ví dụ: bạn có thể hiển thị nó trong ImageView hoặc thực hiện các thao tác khác
		            System.out.println("Image: " + image.getUrl());
		        }

	    }
	}

	


