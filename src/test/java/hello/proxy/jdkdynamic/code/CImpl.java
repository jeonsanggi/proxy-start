package hello.proxy.jdkdynamic.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CImpl implements CInterface {

    @Override
    public String call(String arg1) {
        log.info("{} 호출", arg1);
        return "C";
    }
}
