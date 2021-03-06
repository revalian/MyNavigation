package dicoding.com.lian.mynavigation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_category.*

class CategoryFragment : Fragment() {

    companion object {
        val EXTRA_NAME = "extra_name"
        val EXTRA_STOCK = "extra_stock"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_category_lifestyle.setOnClickListener { view ->
            val toDetailCategoryFragment = CategoryFragmentDirections.actionCategoryFragmentToDetailCategoryFragment()
            toDetailCategoryFragment.name = "Lifestyle"
            toDetailCategoryFragment.stock = 7
            view.findNavController().navigate(toDetailCategoryFragment)
        }
    }
}
