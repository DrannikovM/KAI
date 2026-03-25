public class Task_2 {
    public static void main(String[] args) {
        String text = """
            Рано-вранці стара рама вікна голосно зарипіла від сильного пориву вітру. 
            Микола підвівся з ліжка, бо ця пора завжди була для нього найважливішою. 
            Він знав, що кожна подібна подія — це лише порада долі бути уважнішим. 
            На столі лежала розкрита гра, яку вони не встигли дограти вчора ввечері.
        
            Країна за вікном поступово прокидалася під звуки далекої рації. 
            Хмара на горизонті обіцяла дощ, але робота на городі не могла чекати. 
            Потрібно було залатати діри, поки спека не висушила землю остаточно. 
            Гітара в кутку кімнати мовчала, хоча її струни ще пам'ятали вчорашню пісню.
            """;
        StringBuilder sb = new StringBuilder(text);

        for (int i = 0; i < sb.length() - 2; i++) {
            char current = sb.charAt(i);
            if (Character.toLowerCase(current) != 'р') continue;
            char next = sb.charAt(i + 1);
            if (next != 'а') continue;
            char afterNext = sb.charAt(i + 2);
            if (Character.isLetter(afterNext)) sb.setCharAt(i + 1, 'о');
        }

        System.out.println("Initial text:\n" + text);
        System.out.println("Formatted text:\n" + sb);
    }
}
