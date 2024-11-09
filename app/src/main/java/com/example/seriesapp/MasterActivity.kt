package com.example.seriesapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MasterActivity : AppCompatActivity() {

    private lateinit var recyclerViewSeries: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_master)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        recyclerViewSeries = findViewById(R.id.seriesRV)
        recyclerViewSeries.layoutManager = LinearLayoutManager(this)
        recyclerViewSeries.adapter = SeriesAdapter(this.createSeries(), this)
        recyclerViewSeries.setHasFixedSize(true)
        recyclerViewSeries.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )

    }
        private fun createSeries(): List<SeriesAdapter.Serie> {
            return listOf(
                SeriesAdapter.Serie(
                    R.drawable.atlanta,
                    "Atlanta",
                    "4 temporadas",
                    "2016",
                    "A semi-autobiographical series from Donald Glover, Atlanta follows Earnest “Earn” Marks (Glover), a college dropout who rediscovers his love for rap when his estranged cousin (Vice Principals‘ Brian Tyree Henry) hits it big in the industry."
                ),
                SeriesAdapter.Serie(R.drawable.brooklyn_nine_nine, "Brooklyn Nine-Nine", "8 temporadas", "2013", "BROOKLYN NINE-NINE is a new single-camera workplace comedy about what happens when a hotshot detective (Samberg) gets a new Captain (Braugher) with a lot to prove."),
                SeriesAdapter.Serie(R.drawable.community, "Community", "6 temporadas", "2009", "Community is a smart comedy series about a band of misfits who attend Greendale Community College. At the center of the group is Jeff Winger (Joel McHale, \"The Soup\"), a fast-talking lawyer whose degree has been revoked."),
                SeriesAdapter.Serie(R.drawable.crazy_ex_girlfriend, "Crazy Ex-Girlfriend", "4 temporadas", "2015", "Rebecca Bunch is a successful, driven, and possibly crazy young woman who impulsively gives up everything – her partnership at a prestigious law firm and her upscale apartment in Manhattan – in a desperate attempt to find love and happiness in that exotic hotbed of romance and adventure: West Covina, Calif. "),
                SeriesAdapter.Serie(R.drawable.cunk_on_earth, "Cunk On Earth", "1 temporadas", "2022", "Tells the story of our greatest inventions such as the wheel, the Mona Lisa and nuclear power. Along the way, she will ask experts hard-hitting questions about humanity’s progress, as well as standing near impressive old ruins, or inside museums."),
                SeriesAdapter.Serie(R.drawable.dead_to_me, "Dead To Me", "3 temporadas", "2019", "A powerful friendship blossoms between a tightly wound widow and a free spirit with a shocking secret in this darkly comic series."),
                SeriesAdapter.Serie(R.drawable.lupin, "Lupin", "3 temporadas", "2021", "Inspired by the adventures of Arsène Lupin, gentleman thief Assane Diop sets out to avenge his father for an injustice inflicted by a wealthy Family"),
                SeriesAdapter.Serie(R.drawable.lucifer, "Lucifer", "6 temporadas", "2016","Based on characters from DC Entertainment’s Vertigo imprint, LUCIFER stars Tom Ellis (“Merlin”) as the charming, charismatic and handsome-as-hell original fallen angel, who, bored and unhappy in Hell, takes refuge in Los Angeles, where he uses his gift of persuasion to punish bad guys. But the longer he’s away from the underworld, the greater the threat that the worst of humanity could escape."),
                SeriesAdapter.Serie(R.drawable.killing_eve, "Killing Eve", "4 temporadas", "2018", "From Fleabag's Phoebe Waller-Bridge, Killing Eve is a dramatic thriller revolving around a psychopathic assassin and the woman charged with hunting her down. It is a combination of brutal mischief making and pathos, filled with sharp humor, originality and high stakes action. Season 2 will simulcast on AMC."),
                SeriesAdapter.Serie(R.drawable.kaos, "Kaos", "1 temporada", "2024", "As discord reigns on Mount Olympus and almighty Zeus spirals into paranoia, three mortals are destined to reshape the future of humankind."),
                SeriesAdapter.Serie(R.drawable.the_handmaids_tale, "The Handmaid's Tale", "5 temporadas", "2017", "Adapted from Margaret Atwood’s acclaimed novel, this is the story of life in the dystopia of Gilead, a totalitarian society in what was formerly part of the United States. "),
                SeriesAdapter.Serie(R.drawable.good_girls, "Good Girls", "4 temporadas", "2018","Written and executive produced by Bans and directed by Dean Parisot, the project, from Universal TV, follows three “good girl” suburban wives and mothers who suddenly find themselves in desperate circumstances and decide to stop playing it safe, risking everything to take their power back, and the consequences of their decisions.")
            )
        }

    }
