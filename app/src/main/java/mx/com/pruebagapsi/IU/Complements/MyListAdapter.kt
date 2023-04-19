package mx.com.pruebagapsi.IU.Complements

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import mx.com.pruebagapsi.IU.Network.ResponseSearch.ResponseSearch
import mx.com.pruebagapsi.R

class MyListAdapter (private val context: Context, private val arrayList: ResponseSearch) : BaseAdapter() {
    private lateinit var serialNum: TextView
    private lateinit var name: TextView
    private lateinit var contactNum: TextView
    override fun getCount(): Int {
        return arrayList?.item?.props?.pageProps?.initialData?.searchResult?.itemStacks1?.get(0)!!.items!!.size
    }
    override fun getItem(position: Int): Any {
        return position
    }
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        var convertView = convertView
        convertView = LayoutInflater.from(context).inflate(R.layout.adapterarticulo, parent, false)

        var arraylistNombre = ArrayList<String>()
        var arraylistPrecio = ArrayList<String>()

        arrayList?.item?.props?.pageProps?.initialData?.searchResult?.itemStacks1?.get(0)!!.items!!.indices.forEach {
            arraylistNombre.add(arrayList?.item?.props?.pageProps?.initialData?.searchResult?.itemStacks1?.get(0)!!.items!![it]!!.name.toString())
            arraylistPrecio.add(arrayList?.item?.props?.pageProps?.initialData?.searchResult?.itemStacks1?.get(0)!!.items!![it]?.priceInfo?.linePrice.toString())

        }

        serialNum = convertView.findViewById(R.id.txtArticulo)
        name = convertView.findViewById(R.id.txtPrecio)
        /*serialNum.text = arrayList?.item?.props?.pageProps?.initialData?.searchResult?.itemStacks1?.size  .items!![position]!!.name!!
        name.text = arrayList?.item?.props?.pageProps?.initialData?.searchResult?.itemStacks1?.get(position)!!.items!![position]?.priceInfo?.linePrice!!
*/
        serialNum.text = arraylistNombre.get(position)
        name.text = arraylistPrecio.get(position)
        return convertView
    }
}