package id.web.frizky.spring.service.impl;

import id.web.frizky.spring.service.HelloWorld;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by F.Frizky on 4/11/2016.
 */
@Component
@Scope("prototype")
public class HelloWorldImpl implements HelloWorld {
    Logger LOG = Logger.getLogger(HelloWorldImpl.class);

    private int counter;

    @Override
    public void helloWorld() {
        counter++;
        StringBuilder stringBuilder = new StringBuilder("\n");
        stringBuilder.append("                                              .-'''-.                               .-'''-.                               \n");
        stringBuilder.append("                                .---..---.   '   _    \\                            '   _    \\          .---._______       \n");
        stringBuilder.append("   .              __.....__     |   ||   | /   /` '.   \\                         /   /` '.   \\         |   |\\  ___ `'.    \n");
        stringBuilder.append(" .'|          .-''         '.   |   ||   |.   |     \\  '                 _     _.   |     \\  '         |   | ' |--.\\  \\   \n");
        stringBuilder.append("<  |         /     .-''\"'-.  `. |   ||   ||   '      |  '          /\\    \\\\   //|   '      |  '.-,.--. |   | | |    \\  '  \n");
        stringBuilder.append(" | |        /     /________\\   \\|   ||   |\\    \\     / /           `\\\\  //\\\\ // \\    \\     / / |  .-. ||   | | |     |  ' \n");
        stringBuilder.append(" | | .'''-. |                  ||   ||   | `.   ` ..' /              \\`//  \\'/   `.   ` ..' /  | |  | ||   | | |     |  | \n");
        stringBuilder.append(" | |/.'''. \\\\    .-------------'|   ||   |    '-...-'`                \\|   |/       '-...-'`   | |  | ||   | | |     ' .' \n");
        stringBuilder.append(" |  /    | | \\    '-.____...---.|   ||   |                             '                       | |  '- |   | | |___.' /'  \n");
        stringBuilder.append(" | |     | |  `.             .' |   ||   |                                                     | |     |   |/_______.'/   \n");
        stringBuilder.append(" | |     | |    `''-...... -'   '---''---'                                                     | |     '---'\\_______|/    \n");
        stringBuilder.append(" | '.    | '.                                                                                  |_|                        \n");
        stringBuilder.append(" '---'   '---'                                                                                                            ");
        LOG.info(stringBuilder.toString());
    }

    @Override
    public int getCounter() {
        return counter;
    }
}
