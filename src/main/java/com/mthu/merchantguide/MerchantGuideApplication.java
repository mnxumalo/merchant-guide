package com.mthu.merchantguide;

import com.mthu.merchantguide.component.DirtToNumeral;
import com.mthu.merchantguide.model.DirtMetal;
import com.mthu.merchantguide.model.Metals;
import com.mthu.merchantguide.service.IntergalaxyDirtImplementation;
import com.mthu.merchantguide.service.IntergalaxyGoldImplementation;
import com.mthu.merchantguide.service.IntergalaxyIronImplementation;
import com.mthu.merchantguide.service.IntergalaxySilverImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MerchantGuideApplication {



    public static void main(String[] args) {
        SpringApplication.run(MerchantGuideApplication.class, args);

    }

    @Autowired
    DirtToNumeral dirtToNumeral;

    @Autowired
    IntergalaxyDirtImplementation intergalaxyDirtImplementation;

    @Autowired
    IntergalaxyGoldImplementation intergalaxyGoldImplementation;

    @Autowired
    IntergalaxyIronImplementation intergalaxyIronImplementation;

    @Autowired
    IntergalaxySilverImplementation intergalaxySilverImplementation;

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("::::::::::Merchant's Guide to the Galaxy:::::::::");
            //String inputText = "how much is pish tegj glob glob";
            //String inputText = "how many Credits is glob prok Silver";
            //String inputText = "how many Credits is glob prok Gold";
            //String inputText = "how many Credits is glob prok Iron";
            String inputText = "how much wood could a woodchuck chuck if a woodchuck could chuck wood";

            try {
                String[] metalsArray = inputText.split(" is ");
                String metalsString = metalsArray[1];
                String[] dirtMetals = metalsString.split(" ");
                List<Metals> metalsList = new ArrayList<>();
                for(String metal : dirtMetals){
                    if(dirtToNumeral.getSymbolValues().containsKey(metal)){
                        DirtMetal dirtMetal = new DirtMetal(metal, dirtToNumeral.getSymbolValues().get(metal));
                        metalsList.add(dirtMetal);
                    }
                }

                if(inputText.toLowerCase().contains("silver")){
                    System.out.println(metalsString + " " + intergalaxySilverImplementation.convert(metalsList) + " Credits");
                }
                else if (inputText.toLowerCase().contains("iron")) {
                    System.out.println(metalsString + " is " + intergalaxyIronImplementation.convert(metalsList) + " Credits");
                } else if (inputText.toLowerCase().contains("gold")) {
                    System.out.println(metalsString + " is " + intergalaxyGoldImplementation.convert(metalsList) + " Credits");
                } else {
                    System.out.println(metalsString + " is " + intergalaxyDirtImplementation.convert(metalsList));
                }
            }catch (Exception e){
                System.out.println("I have no idea what you're talking about.");

            }

        };
    }

}
